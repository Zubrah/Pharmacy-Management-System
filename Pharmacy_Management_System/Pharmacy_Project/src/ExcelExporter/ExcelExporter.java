/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcelExporter;
/**
 *
 * @author Zubery Msemo, Nobert Okoye and Ahmed Meshref
 */
import java.io.*;
import javax.swing.*;
import javax.swing.table.TableModel;


public class ExcelExporter {
    ExcelExporter(){}
    
    public void exportTable(JTable Table1, File file) throws IOException {
        TableModel Model;
        Model = jTable1.getModel();
        FileWriter out = new FileWriter(file);
        try (BufferedWriter bw = new BufferedWriter(out)) {
            for(int i=0; i < Model.getColumnCount(); i++) {
                bw.write(Model.getColumnName(i) + "\t");
            }
            bw.write("\n");
            
            for (int i = 0; i < Model.getColumnCount();i++){
                for (int j = 0; j <Model.getColumnCount(); j++){
                    bw.write(Model.getValueAt(i,j).toString()+ "\t");
                }
                bw.write("\n");
            }
        }
        System.out.print("Write to" + file);
    }
    
    
    
    
}
