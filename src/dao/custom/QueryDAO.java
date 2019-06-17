/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.SuperDAO;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public interface QueryDAO extends SuperDAO{
    public int rowCount();

    public int rowCounttwo();
}
