Car Shop Java プログラム 🚗
このJavaプログラムは、車の名前、会社名、モデル年、価格などの基準で車を検索し、表示することができます。価格やモデル年でソートする機能もあります。

機能:
すべての車を表示
車名、会社名、モデル年、価格で検索
価格とモデル年でソート
アーキテクチャ:
モデル: 車のデータを表現
ビュー: 車の情報を表示
コントローラー: アプリのフローを管理し、ユーザー入力を処理
作成方法:
データ構造: 車の名前、会社名、価格などの属性を持つ Car クラスを作成。
MVC設計: プログラムをモデル・ビュー・コントローラーで構造化し、コードの分離を実現。
機能: 検索機能とソート機能を実装。
ユーザーインターフェース: シンプルなテキストベースのメニューで操作。
課題と解決策:
データ管理: 車のオブジェクトのリストを使用して、簡単にアクセス・操作できるようにした。
検索とソート: if文と Collections.sort() を使ってフィルタリングとソートを処理。
UI: メニューをシンプルに保ち、無効な入力にエラーメッセージを表示。