/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeli;

import domen.Igra;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author frado
 */
public class ModelTabeleKlijent extends AbstractTableModel{
    
    ArrayList<Igra> lista;
    String[] kolone = {"rb", "kombinacija", "PogodjenihNaMestu", "PogodjenihNisuNaMestu"};

    public ModelTabeleKlijent() {
        lista = new ArrayList<>();
    }
    
    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Igra igra = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return igra.getRb();
            case 1:
                return igra.getKombinacija();
            case 2:
                return igra.getPogodjeniNaMestu();
            case 3:
                return igra.getPogodjeniNisuNaMestu();
                
            default: return "return!";
        }
        
        
    }

    public void dodajIgru(Igra igra) {
        lista.add(igra);
        fireTableDataChanged();
    }
    
}
