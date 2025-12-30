import java.util.Scanner;

//図書管理システムのメインクラス
class LibraryApp{
  public static void main(String[]args)
  {

    //キーボード入力の受け取り
    Scanner sc=new
      Scanner(System.in);
    Library library=new Library();

    //終了選ぶまで繰り返し表示する
    while(true){
      System.out.println("図書管理システム");
      System.out.println("1:書籍を登録する");
      System.out.println("2:登録済みの書籍を一覧表示する");
      System.out.println("3:書籍を削除する");
      System.out.println("0:終了");

      int choice=sc.nextInt();
      sc.nextLine();

      //書籍登録
      if(choice==1){
        //タイトル入力
        System.out.print("タイトル: ");
        String title=sc.nextLine();

        //著者入力
        System.out.print("著者: ");
        String author=sc.nextLine();

        //出版年登録
        System.out.print("出版年: ");
        int year=sc.nextInt();
        sc.nextLine();

        Book book=new Book(title,author,year);
        
        //libraryに追加
        library.addBook(book);
        System.out.println("登録しました。");

      //一覧表示
      }else if (choice==2){
      library.showBooks();

      //削除
      }else if(choice==3){
        System.out.print("削除する番号: ");
        int num =sc.nextInt();
        sc.nextLine();

        //削除できなかった場合
        if(!library.removeBook(num)){
          System.out.println("削除できませんでした");
        }

        //終了
      }else if (choice==0){
        System.out.println("終了");
        break;

      //指定数字（0~3)以外が入力された場合
      }else{
      System.out.println("0~3を入力してください");
      }
    }
    sc.close();
  }
}

  

