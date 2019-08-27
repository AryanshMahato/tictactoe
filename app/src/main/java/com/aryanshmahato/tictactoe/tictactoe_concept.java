package com.aryanshmahato.tictactoe;

import java.util.ArrayList;

public class tictactoe_concept {
 public boolean winnerAlgo(ArrayList<Integer> array){

//   Winning Positions are:
//   1,2,3
//   1,4,7
//   1,5,9
//   2,5,8
//   3,5,7
//   3,6,9
//   4,5,6
//   7,8,9

//   In below Codes, It's checking wether the arrayList contains the winning Position or not
//   If ArrayList contains winning positions then the function will return true


   if (array.contains(1) && array.contains(2) && array.contains(3)){
     return true;
   }
   else  if (array.contains(1) && array.contains(4) && array.contains(7)){
     return true;
   }
   else  if (array.contains(1) && array.contains(5) && array.contains(9)){
     return true;
   }
   else  if (array.contains(2) && array.contains(5) && array.contains(8)){
     return true;
   }
   else  if (array.contains(3) && array.contains(5) && array.contains(7)){
     return true;
   }
   else  if (array.contains(3) && array.contains(6) && array.contains(9)){
     return true;
   }
   else  if (array.contains(4) && array.contains(5) && array.contains(6)){
     return true;
   }
   else  if (array.contains(7) && array.contains(8) && array.contains(9)){
     return true;
   }


   return false;


 }
}




















