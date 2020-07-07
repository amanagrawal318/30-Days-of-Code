// Complete the solve function below.

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip=(meal_cost*tip_percent)/100;
        double tax=(meal_cost*tax_percent)/100;
        double sum;
        sum=meal_cost+tip+tax;

      System.out.println(Math.round(sum));
    }
