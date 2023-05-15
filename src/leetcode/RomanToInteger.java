package leetcode;

public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("III"));
    System.out.println(romanToInt("LVIII"));
    System.out.println(romanToInt("MCMXCIV"));
  }

  public static int romanToInt(String s) {
    int erg = 0;
    int zwErg = 0;
    int vorErg = 1000;

    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case 'I' -> zwErg = 1;
        case 'V' -> zwErg = 5;
        case 'X' -> zwErg = 10;
        case 'L' -> zwErg = 50;
        case 'C' -> zwErg = 100;
        case 'D' -> zwErg = 500;
        case 'M' -> zwErg = 1000;
      }
      if(zwErg > vorErg){
        erg = erg - vorErg*2 + zwErg;
      }else {
        erg += zwErg;
      }
      vorErg = zwErg;
    }
    return erg;
  }
}
