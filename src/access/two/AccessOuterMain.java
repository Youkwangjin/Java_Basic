package access.two;

import access.one.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public 호출 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        /*
            같은 패키지가 아니기 때문에  default 호출 불 가능
            accessData.defaultField = 2;
            accessData.defaultMethod();
        */
        accessData.innerAccess();
    }
}
