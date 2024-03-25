package Java.practiceQuestions;
/*Write a JAVA program to do the following.
A class has two double variables. Write constructors A. Initialize the two variables with value 10 and 100. 
B.Initialize both the variable with same value. */
public class Q3 {
        private double var1;
        private double var2;
    
        public Q3() {
            var1 = 10;
            var2 = 100;
        }
    
        public Q3(double val) {
            var1 = val;
            var2 = val;
        }
    
        public double getVar1() {
            return var1;
        }
    
        public double getVar2() {
            return var2;
        }
    
        public static void main(String[] args) {
            Q3 obj1 = new Q3();
            System.out.println("Var1: " + obj1.getVar1());
            System.out.println("Var2: " + obj1.getVar2());
    
            Q3 obj2 = new Q3(5.5);
            System.out.println("Var1: " + obj2.getVar1());
            System.out.println("Var2: " + obj2.getVar2());
        }
    }
    

