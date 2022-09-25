public class Polynomial {
    double num[];
    
    public Polynomial() {
        num = new double[1];
        num[0] = 0;
    }
    public Polynomial(double coefficient[]) {
        num = new double[coefficient.length];
        int x = 0;
        for(double number:coefficient) {
            num[x] = number;
            x = x+1;
        }
    }
    public Polynomial add(Polynomial x) {
        double[] array = new double[x.num.length];
        if(num.length != x.num.length) {
            int i = 0;
            if(num.length > x.num.length) {
                for(double h : x.num) {
                    array[i] = x.num[i] + num[i];
                    i++;}
                for(int j=0; j<num.length; j++) {
                    array[j] = num[j];
                  }
            }
            else {
                for(double h : num) {
                    array[i] = x.num[i] + num[i];
                    i++;}
                while(i < x.num.length) {
                    array[i] = x.num[i];
                    i++;
                  }
            }
        } else {
            int i = 0;
            for(double h : x.num) {
                array[i] = x.num[i] + num[i];
                i++;
            }
        }
        Polynomial poly= new Polynomial(array);
        return poly;
    }
    public double evaluate(double input) {
        double a = 0;
        a = a + num[0];
        for(int z = 1; z < num.length; z = z+1) {
            a = a + num[z]*Math.pow(input, z);
        }
        return a;
    }
    public boolean hasRoot(double input) {
        double a = 0;
        
        a = evaluate(input);
        
        if(a == 0) {
            return true;
        }
        return false;
    }
}
