

//| Input | Output |
  //      | ----------- | ----------- |
    //    | `aaaaaaaaaaaaaaaaaaabbbbbbbbnnnnneeeeeemmmeeeeeeaaaa` | `a19b8n5e6m3e6a4` |
public class StrEncoded {

    public static String strEncoded (String str){
        int strLen= str.length();
        String strResult="";
        int countLetra=1;
        char letraAtual=str.charAt(0);
        for (int i = 0; i < strLen; i++) {
          char letra1=str.charAt(i);
            //char letra2=str.charAt(i+1);
          if(letraAtual==letra1){
              countLetra++;
          }else{
              strResult= strResult + letraAtual + countLetra;
              countLetra=1;
          }
            letraAtual=str.charAt(i);
        }
        return strResult+ letraAtual + countLetra;
    }
}
