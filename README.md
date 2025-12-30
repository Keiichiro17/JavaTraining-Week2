# JavaTraining-Week2
・プログラムの目的
書籍のタイトル・著者・出版年を登録、保存、閲覧、削除できる図書管理システムの作成。
実行方法　Powershellで cd C:\Users\keiichiro\JavaTraining-Week2\src→
javac-encoding UTF-8 Book.java Library.java LibraryApp.java→java LibraryApp

※Powershellで文字化けが発生したので932(Shift_JIS)から65001(UTF-8)に変更

Bookは書籍1冊を表してタイトル、著者、出版年をフィールドに持たせた。
Libraryは書籍を登録、保存、一覧表示、削除できるようにした。
LibraryAppはメニューを表示し、ユーザー入力を受け付けるようにした。

追加機能　LibraryAppでユーザーが0から3以外を入力した場合0~3を入力してくださいと表示されるようにした。
