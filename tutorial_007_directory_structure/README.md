# tutorial_006_package_domain

## tree

```
.
├── README.md
├── build
│   └── classes   // 自動生成
└── src
    ├── main
    │   ├── java
    │   │   └── xyz
    │   │       └── nago3
    │   │           ├── Main.java
    │   │           └── modules
    │   │               ├── Calculator.java
    │   │               └── Hello.java
    │   └── resources
    └── test
        ├── java
        └── resources
```

## Command

### compile

```
$ javac -sourcepath src/main/java -d build/classes src/main/java/xyz/nago3/Main.java
```

- -sourcepath
  - どこがソースの置き場かを設定する
- -d
  - build したファイルの出力先
- xxx/xxx/...
  - エントリポイントのソースファイルを指し示す
  - カレントディレクトリを基準として呼び出す

### run

```
$ java -classpath build/classes xyz.nago3.Main
```

- -classpath
  - 生成されたクラスファイルの場所を指定する
- xxx.xxx.Main
  - エントリポイントとなるクラスを呼び出す
