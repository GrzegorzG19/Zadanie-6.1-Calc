public class Calculator {


  public double math(double a,double b){
    if (a > b){
        System.out.printf("liczba %.2f jest wieksza od %.2f, dodaje:",a,b);
        return a+b;
    }
    else if (a < b) {
        System.out.printf("liczba %.2f jest mniejsza od %.2f, mnoże",a,b);
        return a * b;
    }
    else {
        System.out.printf("liczba %.2f jest równa %.2f, kwadrat liczby",a,b);
    return a*a;
        }

    }

}
