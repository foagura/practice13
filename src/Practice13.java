public class Practice13 {
    public static void main(String[] args){
        /* 繰り返し文（while文） */
        int a = 5;

        while (a > 0) {    // while文の条件式にfalseを直接入れると、処理文が実行されないことが明らかなためコンパイルエラーになる
            System.out.println("aの値は" + a);
            --a;
        }

        while (a == 0)
            System.out.println("aの値は" + a);    // 処理文が１つのみの場合は省略できる
    }
}
