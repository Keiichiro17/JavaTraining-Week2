import java.util.Scanner;
class LibraryApp{
  public static void main(String[]args)
  {
    Scanner sc=new
      Scanner(System.in);
    Library library=new Library();

    while(true){
      System.out.println("1:書籍を登録");
      System.out.println("2:一覧表示");
      System.out.println("3:削除");
      System.out.println("0:終了");
      System.out.print("選択");

      int choice=sc.nextInt();
      sc.nextLine();

      if(choice==1){
        System.out.print("タイトル: ");
        String title=sc.nextLine();

        System.out.print("著者: ")
        String author=sc.nextLine();
        sc.nextline();

        System.out.print("出版年": ");
        int year=sc.nextInt();
        sc.nextline();

        Book book=new Book(title,author,year);
        library.addbook(book);
        System.out.println("登録しました。")
        
      }else if (choice==2){
      library.showBooks();
        
      }else if(choice==3){
        System.out.print("削除する番号: ")
        int num =sc.nextInt();
        sc.nextline();

        if(!library.removeBook(num)){
          System.out.println("削除できませんでした");
        }

      }else if (choice==0){
        System.out.println("終了します");
        break:
          }
    }
  }
}

    }
  }
}

  

