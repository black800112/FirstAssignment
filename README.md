主要功能

1.圖形使用者介面 (GUI)： 透過 DiscountCalcUI.java 提供直覺互動的介面來計算折扣。 

2.核心計算邏輯： 透過 DiscountCalc.java 與 DiscountCalc1.java 實作折扣計算規則與核心運算邏輯。 

3.事件驅動架構： 運用內部類別處理使用者互動與介面事件。 


開始使用系統需求Java

1.開發套件 (JDK)： 建議版本為 8 或以上。

2.開發環境： Eclipse IDE（專案內含 Eclipse 專用的 .project 與 .classpath 設定檔）。  


在 Eclipse 中執行專案

1.開啟 Eclipse IDE。

2.點選選單的 File > Import...。

3.選擇 General > Existing Projects into Workspace 並點擊 Next。 

4.瀏覽並選擇包含 DiscountCalc 資料夾的根目錄。

5.點擊 Finish 將專案匯入工作區。

6.在專案總管中找到 src/com/DiscountCalcUI.java，點擊右鍵並選擇 Run As > Java Application 即可執行。 


# DiscountCalc

這是一個基於 Java 開發的桌面計算應用程式，旨在幫助使用者更有效率地計算折扣價格。本專案為 Eclipse IDE 專案，採用了 Java 圖形使用者介面（GUI）進行設計。

## 專案結構

```text
DiscountCalc/
├── .classpath              # Eclipse 類別路徑設定檔
├── .project                # Eclipse 專案設定檔
├── .settings/              # Eclipse 工作區設定
│   ├── org.eclipse.core.resources.prefs
│   └── org.eclipse.jdt.core.prefs
├── bin/                    # 編譯後的位元組碼檔案 (.class)
│   └── com/
│       ├── DiscountCalc.class
│       ├── DiscountCalc1.class
│       ├── DiscountCalcUI.class
│       └── DiscountCalcUI$*.class (UI 事件處理相關內部類別)
└── src/                    # 原始程式碼目錄
    └── com/
        ├── DiscountCalc.java
        ├── DiscountCalc1.java
        └── DiscountCalcUI.java
