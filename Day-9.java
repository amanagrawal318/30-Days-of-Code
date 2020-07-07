 
    // Complete the factorial function below.

static int factorial(int n) {
        if(n==1)
        return 1;
        int myfact=n*factorial(n-1);
        return myfact;
    }
