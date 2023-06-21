package com.breezefsmvenseconnect.app.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.breezefsmvenseconnect.app.AppConstant
import com.breezefsmvenseconnect.features.marketAssist.OrderDtlsLast30Days
import com.breezefsmvenseconnect.features.marketAssist.SuggestiveProduct
import com.breezefsmvenseconnect.features.performanceAPP.NoOrderTakenList
import com.breezefsmvenseconnect.features.performanceAPP.NoOrderTakenShop
import com.breezefsmvenseconnect.features.performanceAPP.NoProductSoldShop
import com.breezefsmvenseconnect.features.performanceAPP.PartyWiseDataModel


/**
 * Created by Saikat on 23-Sep-18.
 */
@Dao
interface OrderDetailsListDao {

    @Query("SELECT * FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " order by id desc")
    fun getAll(): List<OrderDetailsListEntity>

    @Query("SELECT * FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " where shop_id=:shop_id order by id desc")
    fun getListAccordingToShopId(shop_id: String): List<OrderDetailsListEntity>

    @Query("SELECT * FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " where SUBSTR(order_details_list.date , 1,10)>=:date_start and SUBSTR(order_details_list.date , 1,10)<=:date_end and shop_id=:shop_id order by id desc")
    fun getListAccordingTodateonOrderDD(date_start:String,date_end:String,shop_id: String): List<OrderDetailsListEntity>

    @Query("SELECT DISTINCT(shop_detail.assigned_to_pp_id) FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE +
            " inner join shop_detail on shop_detail.shop_id = order_details_list.shop_id  where SUBSTR(order_details_list.date , 1,10)>=:date_start and SUBSTR(order_details_list.date , 1,10)<=:date_end ")
    fun getListAccordingTodateonOrderPP(date_start:String,date_end:String): List<String>

    @Query("SELECT * FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " where isUploaded=:isUploaded and order_id=:order_id")
    fun getUnsyncListAccordingToOrderId(order_id: String, isUploaded: Boolean): List<OrderDetailsListEntity>

    @Query("SELECT * FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " where isUploaded=:isUploaded")
    fun getUnsyncedData(isUploaded: Boolean): List<OrderDetailsListEntity>

    @Query("SELECT MAX(CAST(amount as DOUBLE)) FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " where shop_id=:shop_id")
    fun getAmountAccordingToShopId(shop_id: String): String

    @Insert
    fun insert(vararg orderDetails: OrderDetailsListEntity)

    @Query("update " + AppConstant.ORDER_DETAILS_LIST_TABLE + " set isUploaded=:isUploaded where order_id=:order_id")
    fun updateIsUploaded(isUploaded: Boolean, order_id: String)

    @Query("SELECT * FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " where only_date=:date order by id desc")
    fun getListAccordingDate(date: String): List<OrderDetailsListEntity>

    @Query("DELETE FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE)
    fun delete()

    @Query("SELECT * FROM " + AppConstant.ORDER_DETAILS_LIST_TABLE + " where order_id=:order_id")
    fun getSingleOrder(order_id: String): OrderDetailsListEntity

    @Query("select SUM(amount) from order_details_list where shop_id=:shop_id ")
    fun getOrderSumAmt(shop_id: String): String

    @Query("select * from order_details_list where shop_id=:shop_id ")
    fun getOrderAmtShop(shop_id: String): List<OrderDetailsListEntity>

    @Query("select amount from order_details_list where order_id=:order_id ")
    fun getOrderAmt(order_id: String): String

    @Query("select order_id from order_details_list where order_id=:order_id ")
    fun getOrderId(order_id: String): String

    @Query("select only_date from order_details_list where order_id=:order_id ")
    fun getOrderDate(order_id: String): String

    @Query("select distinct shop_id from order_details_list where only_date !=:only_date")
    fun getDistinctShopIDExceptCurrDate(only_date:String): List<String>

    @Query("select * from order_details_list where only_date=:only_date and shop_id=:shop_id ")
    fun getAllByOnlyDate(only_date:String,shop_id:String): List<OrderDetailsListEntity>


    @Query("select SUM(amount) as total_order_value FROM "+AppConstant.ORDER_DETAILS_LIST_TABLE+" where date(date) BETWEEN :dateOfmonth1stdate AND :currentDate")
    fun getOrderValueMTD(dateOfmonth1stdate: String,currentDate:String): String

    @Query("select count(*) as total_order_count FROM "+AppConstant.ORDER_DETAILS_LIST_TABLE+" where date(date) BETWEEN :dateOfmonth1stdate AND :currentDate")
    fun getOrderCountMTD(dateOfmonth1stdate: String,currentDate:String): String

    /*@Query("select sum(amount) as toltaOrdV from order_details_list where shop_id in(select shop_id from shop_detail where type=:type) order by id desc limit 10")
    fun getTotalOrdershopTypewise(type: String): String*/

//    @Query("select * from order_details_list inner join shop_detail on order_details_list.shop_id = shop_detail.shop_id where shop_detail.type=:type order by order_details_list.id desc limit 10")
//    fun getTotalOrdershopTypewise(type: String): List<OrderDetailsListEntity>

    @Query("select sum(amount) from (select * from order_details_list inner join shop_detail on order_details_list.shop_id = shop_detail.shop_id where shop_detail.type=:type order by order_details_list.id desc limit 10)")
    fun getTotalOrdershopTypewise(type: String): String

    @Query("select count(*) as toltaOrdCount from (select * from order_details_list inner join shop_detail on order_details_list.shop_id = shop_detail.shop_id where shop_detail.type=:type order by order_details_list.id desc limit 10)")
    fun getOrderCountshopTypewise(type: String): String


    @Query("SELECT MAX(date) FROM order_details_list  where shop_id=:shop_id")
    fun getLastOrderDate(shop_id: String): String


    @Query("select sum(amount) as toltaOrdV from order_details_list where shop_id=:shop_id")
    fun getTotalSalesValues(shop_id: String): String

//    @Query("select sum(amount) as total_sales_value,(select shop_name from shop_detail where shop_id=:shop_id)  as shop_name ,(select shoptype_name from shop_type_list where shoptype_id =(select type from shop_detail where shop_id=:shop_id)) as shop_type_name from order_details_list where shop_id=:shop_id")
//    fun getTotalShopNTwiseSalesValues(shop_id: String): PartyWiseDataModel

    @Query("select sum(amount) as total_sales_value,(select shop_name from shop_detail where shop_id=:shop_id)  as shop_name,'' as shop_type_name from order_details_list where shop_id=:shop_id")
    fun getTotalShopNTwiseSalesValues(shop_id: String): PartyWiseDataModel

    @Query("select (sum(amount)/count(*)) as avgOrdVal from order_details_list where shop_id=:shop_id")
    fun getAvgOrderValue(shop_id: String): Double

    @Query("select product_id,product_name,qty,rate,total_price from order_product_list where order_id  \n" +
            "in (select order_id from order_details_list where shop_id=:shop_id order by id desc limit 30)")
    fun getSuggestProduct(shop_id: String): List<SuggestiveProduct>



    @Query("select product_id,product_name,qty,rate,total_price from order_product_list where order_id  \n" +
            "in (select order_id from order_details_list where shop_id=:shop_id order by id)")
    fun getSuggestProductAll(shop_id: String): List<SuggestiveProduct>

    @Query("select product_id,product_name,qty,rate,total_price from order_product_list where order_id  \n" +
            "in (select order_id from order_details_list where shop_id=:shop_id order by id desc limit 30)")
    fun getSuggestProduct30Days(shop_id: String): List<SuggestiveProduct>

    @Query("select amount from order_details_list where shop_id=:shop_id order by id desc limit 30")
    fun getLast30DaysOrderAmt(shop_id: String): List<String>

    @Query("select B.product_id,B.product_name,B.qty,B.rate,B.total_price,date,A.order_id from order_details_list as A \n" +
            "inner join order_product_list as B on A.order_id = B.order_id where A.shop_id =:shop_id \n" +
            "order by A.id desc limit 30\n")
    fun getLast30DaysOrderDtls(shop_id: String): List<OrderDtlsLast30Days>

    @Query("select shop_id,shop_name,owner_contact_number,address,case when owner_name IS NULL then '' else owner_name END as owner_name,type from shop_detail where shop_id not in\n" +
            "( select shopid from shop_activity where date(visited_date) between :dateOf3monthago and :currentDate ) and isOwnshop = 1")
    fun getShopNotVisited30DaysDtls(dateOf3monthago: String,currentDate:String): List<NoOrderTakenShop>

    @Query("select shop_id,shop_name,owner_contact_number,address,case when owner_name IS NULL then '' else owner_name END as owner_name,type from shop_detail where shop_id not in\n" +
            "( select shop_id from collection_list where date between :dateOf3monthago and :currentDate)and isOwnshop = 1")
    fun getShopNotCollection30DaysDtls(dateOf3monthago: String,currentDate:String): List<NoOrderTakenShop>


    @Query("select shop_id,shop_name,owner_contact_number,address,case when owner_name IS NULL then '' else owner_name END as owner_name,type from shop_detail where shop_id not in (\n" +
            "select shop_id from order_details_list where date(date) between :dateOf3monthago and :currentDate \n" +
            ") and isOwnshop = 1")
    fun getNoOrderTaken(dateOf3monthago: String,currentDate:String): List<NoOrderTakenShop>


    @Query("select shop_id,shop_name,owner_contact_number,address,case when owner_name IS NULL then '' else owner_name END as owner_name,type, JULIANDAY(date())- JULIANDAY(added_date) as age_since_party_creation_count from shop_detail where shop_id not in (\n" +
            "select shop_id from order_details_list \n" +
            ") and isOwnshop = 1 order by age_since_party_creation_count")
    fun getNoOrderTakeList(): List<NoOrderTakenList>


    @Query("select product_name from product_list where id not in (\n" +
            "select DISTINCT(product_id) from order_product_list where order_id in \n" +
            "(\n" +
            "select order_id from order_details_list where date(date) between :dateOf3monthago and :currentDate \n" +
            "))")
    fun getProductNotsell(dateOf3monthago: String,currentDate:String): List<NoProductSoldShop>

}