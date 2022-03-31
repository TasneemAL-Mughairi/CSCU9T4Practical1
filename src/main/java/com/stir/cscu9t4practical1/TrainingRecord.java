// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    private List<Swim> swim;
    private List<Run> run;
    private List<Cycle> cycle;
   
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
        swim = new ArrayList<Swim>();
        run = new ArrayList<Run>();
        cycle = new ArrayList<Cycle>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   public void addSwimEntry(Swim e){
	   swim.add(e);
	   }
	   public void addRunEntry(Run e){
	   run.add(e);
	   }
	   public void addCycleEntry(Cycle e){
	   cycle.add(e);
	   }
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String removeEntry (String n, int d, int m, int y) {
	   ListIterator<Entry> iter = tr.listIterator();
	   String result = "No entries found";
	   while (iter.hasNext()) {
		   Entry current = iter.next();
	   if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
	   result = current.getEntry();
	   }
	   return result;
   }
   
// find all the entry of a given day and month
   public String FindAllEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = result + current.getEntry();
            } 
       return result;
   } // lookupEntry
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord