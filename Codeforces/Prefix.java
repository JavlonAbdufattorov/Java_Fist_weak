package Codeforces;

class Prefix {


    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));

    }


    public static String longestCommonPrefix(String[] strs) {
        boolean flag = false;
        if(strs.length<2)return strs[0];
        for(int i = strs[0].length(); i>0;i--){
            String ws = strs[0].substring(0,i);
            for(int j = 1 ; j<strs.length;j++){
                
                if (strs[j].startsWith(ws)&&(strs[0].length()>ws.length())){
                    flag = true;
                }

            }
            if (flag){
                return strs[0].substring(0,i);
            }
        }
        return "";
    }




}
