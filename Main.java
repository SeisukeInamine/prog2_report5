public class Main {
    public static void main(String[] args) {
        String str = null; // 条件1: null を代入

        try {
            System.out.println(str.length()); // NullPointerException発生
        } catch (NullPointerException e) { // 条件1: 例外をキャッチ
            System.out.println("エラー: NullPointerException が発生しました。"); // 条件2: エラーメッセージを表示
            System.out.println("例外メッセージ: " + e.getMessage()); // 条件3: getMessage() を出力
        }
    }
}
