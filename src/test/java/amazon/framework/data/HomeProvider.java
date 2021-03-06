package amazon.framework.data;
import org.testng.annotations.DataProvider;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;

public class HomeProvider {

        @org.testng.annotations.DataProvider(name = "SignUpProvider")
        public Iterator<Object[]> getSignUpInfo(){
            List<Object[]> signUp= ExcelReader.getDataFromSheet("SignUp", true);
            return signUp.listIterator();

        }
        @org.testng.annotations.DataProvider(name = "SignInProvider")
        public Iterator<Object[]> getSignInInfo(){
            List<Object[]> signIn= ExcelReader.getDataFromSheet("SignIn", true);
            return signIn.listIterator();
            // return signIn.stream().limit(2).collect(Collectors.toList()).listIterator();
            //hack to pick 2 values in this case

        }
        @org.testng.annotations.DataProvider(name = "IncorrectPasswordSignUp")
        public Iterator<Object[]> getIncorrectPasswordSignUp(){
            List<Object[]> IncorrectPasswordSignUp= ExcelReader.getDataFromSheet("IncorrectPasswordSignUp", true);
            return IncorrectPasswordSignUp.listIterator();

        }
    }


