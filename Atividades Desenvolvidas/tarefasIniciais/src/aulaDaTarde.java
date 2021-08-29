public class aulaDaTarde {
    public static void main(String[] args) {
//        If (1!1){
//            Sou("primeiro if”);
//
//]else{
//                If(1!1){
//                    Sou(“primeiro is do else”)
//                }else{
//                    Sou(else dentro dio else);

        if ( 1 != 1 ){
            System.out.println("primeiro if");
        }else {
            if ( 1 != 1 ){
                System.out.println("primeiro if do else");
            }
            else {
                System.out.println("else dentro do else");

            }
            int value1 = 7;
            int value2 = 5;
            int maxValue = value1 > value2 ? value1 : value2 ;
            System.out.println(maxValue);


            int value3 = 10;
            int value4 = 4;
            if (value1 > value2)
                System.out.println("value 1 is bigger");
            else
                System.out.println("value 1 is not bigger");

        }

    }
}
