# tutorial_006_package_domain

If you use packages, compile with dir path.

## Command

エントリポイントとなるソースファイルをコンパイルすれば、
必要なモジュールも自動でコンパイルされる

### compile

```
$ javac xyz/nago3/Main.java
```

### run

```
$ java xyz.nago3.Main
```

## Attention

package を自作しても、他の package と同等の扱いをする必要があり、
パッケージを利用する場合は package 宣言をする
