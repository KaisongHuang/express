package HistoryService;

public interface HistoryService {
	   public void init(String id);
       public void courier(String id);
       public void SellingArea(String id,String sellingAreaID,String state);
       public void Centre(String id,String centreID,String state);
       public void Warehouse(String id,String WarehouseID,String state);
       
}
