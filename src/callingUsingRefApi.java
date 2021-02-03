import java.lang.reflect.Method;

public class callingUsingRefApi {
    public static void main(String args[]) throws Exception {
//        testReflection t = new testReflection( "Method is invoked using reflection" , false);
//        Class tClass = t.getClass();
//
//        Method gs1Method = tClass.getMethod("getString1" , new Class[]{});
//        String str1 = (String) gs1Method.invoke(t , new Object[]{});
//        System.out.println("Invoking method 'getString1' :: "+ str1);

        //********************
        refApiTest T1 = new refApiTest( 9 );
        Class T1Class = T1.getClass();

        Method exeMethod = T1Class.getMethod("runPyramidNumber" , new Class[]{});
        exeMethod.invoke(T1, new Object[]{});
    }
}
