package cn.ygl.zkview.util;

public final class StrUtil {

    private StrUtil(){}

    public static boolean equals(String src, String dst){
        if(src == null || dst == null){
            return false;
        }

        if(src.length() == 0 || dst.length() == 0){
            return false;
        }

        if(src.length() != dst.length()){
            return false;
        }

        return src.equals(dst);
    }

    public static boolean isEmpty(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
