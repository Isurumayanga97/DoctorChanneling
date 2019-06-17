/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.QueryDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class QueryDAOImpl implements QueryDAO{

    @Override
    public int rowCount()  {
        
          int row=0;
          try {  
            ResultSet rst=CrudUtil.executeQuery("select count(*) from doctor");
            while(rst.next()){
                row=rst.getInt("count(*)");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QueryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QueryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    return row;
}
    
    public int rowCounttwo()  {
        
          int row=0;
          try {  
            ResultSet rst=CrudUtil.executeQuery("select count(*) from appoinment");
            while(rst.next()){
                row=rst.getInt("count(*)");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QueryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QueryDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    return row;
}
}