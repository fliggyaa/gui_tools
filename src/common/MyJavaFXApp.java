/*
 *                        _oo0oo_
 *                       o8888888o
 *                       88" . "88
 *                       (| -_- |)
 *                       0\  =  /0
 *                     ___/`---'\___
 *                   .' \\|     |// '.
 *                  / \\|||  :  |||// \
 *                 / _||||| -:- |||||- \
 *                |   | \\\  - /// |   |
 *                | \_|  ''\---/''  |_/ |
 *                \  .-\__  '-'  ___/-. /
 *              ___'. .'  /--.--\  `. .'___
 *           ."" '<  `.___\_<|>_/___.' >' "".
 *          | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *          \  \ `_.   \_ __\ /__ _/   .-` /  /
 *      =====`-.____`.___ \_____/___.-`___.-'=====
 *                        `=---='
 * 
 * 
 *      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 
 *            佛祖保佑     永不宕机     永无BUG
 * 
 *        佛曰:  
 *                写字楼里写字间，写字间里程序员；  
 *                程序人员写程序，又拿程序换酒钱。  
 *                酒醒只在网上坐，酒醉还来网下眠；  
 *                酒醉酒醒日复日，网上网下年复年。  
 *                但愿老死电脑间，不愿鞠躬老板前；  
 *                奔驰宝马贵者趣，公交自行程序员。  
 *                别人笑我忒疯癫，我笑自己命太贱；  
 *                不见满街漂亮妹，哪个归得程序员？
 */



package com;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;







public class MyJavaFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("hack_GUI_tools");

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));


        // Middle section
        TabPane tabPane = new TabPane();
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        Tab tab1 = new Tab("信息收集");

        VBox tab1_vbox1 = new VBox();
        tab1_vbox1.setSpacing(10);
        tab1_vbox1.setPadding(new Insets(10, 10, 10, 10));


//定义功能按钮
        Button nmapButton = new Button("Ze-nmap");
        nmapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nmap_path = "文件路径";
                String command = "cmd /c start \"\" \"" + nmap_path + "\"";
                runTools(command);
            }
        });
        Button dirsearchButton = new Button("dirsearch");
        dirsearchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String dirsearch_path = "文件路径";
                String command = "cmd /c start cmd.exe /K cd /d " + dirsearch_path;
                runTools(command);
            }
        });
        Button yujianButton = new Button("御剑");
        yujianButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String yujianexe_path = "文件路径\\御剑目录扫描专业版v1.1.exe";
                String yujian_path = "文件路径";
                String command = "cmd /c start \"\" \"" + yujianexe_path + "\"";
                openInSpePath(command, yujian_path);;
            }
        });
        Button cduanButton = new Button("网段扫描");
        cduanButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String cduan_path = "文件路径\\C段扫描.exe";
                String command = "cmd /c start \"\" \"" + cduan_path + "\"";
                runTools(command);
            }
        });
        Button fofaButton = new Button("fofaviewer");
        fofaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String fofa_path = "文件路径";
                String command = "java -jar fofaviewer.jar";
                openJar(command, fofa_path);
            }
        });
        Button layerButton = new Button("Layer子域名挖掘机V3.0");
        layerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String layer_path = "文件路径\\Layer.exe";
                String command = "cmd /c start \"\" \"" + layer_path + "\"";
                runTools(command);
            }
        });
        Button oneforallButton = new Button("OneForAll-0.4.5");
        oneforallButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String oneforall_path = "文件路径";
                String command = "cmd /c start cmd.exe /K cd /d " + oneforall_path;
                runTools(command);
            }
        });
        Button subfinderButton = new Button("subfinder");
        subfinderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String subfinder_path = "文件路径";
                String command = "cmd /c start cmd.exe /K cd /d " + subfinder_path;
                runTools(command);
            }
        });
        Button afrogButton = new Button("afrog");
        afrogButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String afrog_path = "文件路径";
                String command = "cmd /c start cmd.exe /K cd /d " + afrog_path;
                runTools(command);
            }
        });
        Button GlassButton = new Button("Glass");
        GlassButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String Glass_path = "文件路径";
                String command = "cmd /c start cmd.exe /K cd /d " + Glass_path;
                runTools(command);
            }
        });
        Button urlfinderButton = new Button("js收集");
        urlfinderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String urlfinder_path = "文件路径";
                String command = "cmd /c start cmd.exe /K cd /d " + urlfinder_path;
                runTools(command);
            }
        });


        Button yunxiButton = new Button("云悉");
        yunxiButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String yunxi_url = "https://www.yunsee.cn/";
                OpenBrowserExample(yunxi_url);
            }
        });


//端口扫描
        HBox tab1_hbox1 = new HBox();
        tab1_hbox1.setSpacing(10);
        tab1_hbox1.setPadding(new Insets(10, 10, 10, 10));
        Text tab1_text1 = new Text("端口扫描");
        tab1_hbox1.getChildren().addAll(nmapButton, fofaButton);
        tab1_vbox1.getChildren().addAll(tab1_text1, tab1_hbox1);

//网段扫描
        HBox tab1_hbox2 = new HBox();
        tab1_hbox2.setSpacing(10);
        tab1_hbox2.setPadding(new Insets(10, 10, 10, 10));
        Text tab1_text2 = new Text("网段扫描");
        tab1_hbox2.getChildren().addAll(cduanButton);
        tab1_vbox1.getChildren().addAll(tab1_text2, tab1_hbox2);

//指纹识别
        HBox tab1_hbox3 = new HBox();
        tab1_hbox3.setSpacing(10);
        tab1_hbox3.setPadding(new Insets(10, 10, 10, 10));
        Text tab1_text3 = new Text("指纹识别");
        tab1_hbox3.getChildren().addAll(afrogButton, GlassButton, yunxiButton);
        tab1_vbox1.getChildren().addAll(tab1_text3, tab1_hbox3);

//路径探测
        HBox tab1_hbox4 = new HBox();
        tab1_hbox4.setSpacing(10);
        tab1_hbox4.setPadding(new Insets(10, 10, 10, 10));
        Text tab1_text4 = new Text("路径收集");
        tab1_hbox4.getChildren().addAll(dirsearchButton, yujianButton, urlfinderButton);
        tab1_vbox1.getChildren().addAll(tab1_text4, tab1_hbox4);

//子域名收集
        HBox tab1_hbox5 = new HBox();
        tab1_hbox5.setSpacing(10);
        tab1_hbox5.setPadding(new Insets(10, 10, 10, 10));
        Text tab1_text5 = new Text("子域名收集");
        tab1_hbox5.getChildren().addAll(layerButton, oneforallButton, subfinderButton);
        tab1_vbox1.getChildren().addAll(tab1_text5, tab1_hbox5);

//网络空间测绘工具
        HBox tab1_hbox6 = new HBox();
        tab1_hbox6.setSpacing(10);
        tab1_hbox6.setPadding(new Insets(10, 10, 10, 10));
        Text tab1_text6 = new Text("网络空间测绘");
        tab1_hbox6.getChildren().addAll(fofaButton);
        tab1_vbox1.getChildren().addAll(tab1_text6, tab1_hbox6);

        tab1.setContent(tab1_vbox1);
        tabPane.getTabs().add(tab1);





//owasp常用工具
        Tab tab2 = new Tab("owasp");
        VBox tab2_vbox1 = new VBox();
        tab2_vbox1.setSpacing(10);
        tab2_vbox1.setPadding(new Insets(10, 10, 10, 10));


        Button sqlmapButton = new Button("sqlmap");
        sqlmapButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String sqlmap_path = "文件路径";
                String command = "cmd /c start cmd.exe /K cd /d " + sqlmap_path;
                runTools(command);
            }
        });
        Button sqlInjButton = new Button("超级SQL注入工具【SSQLInjection】");
        sqlInjButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String sqlinj_path = "文件路径\\SuperSQLInjection.exe";
                String command = "cmd /c start \"\" \"" + sqlinj_path + "\"";
                runTools(command);
            }
        });
        Button weakPassButton = new Button("超级弱口令检查工具");
        weakPassButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String weakPass_path = "文件路径\\SNETCracker.exe";
                String command = "cmd /c start \"\" \"" + weakPass_path + "\"";
                runTools(command);
            }
        });
        Button godzillaButton = new Button("godzilla");
        godzillaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String godzilla_path = "文件路径";
                String command = "java -jar godzilla.jar";
                openJar(command, godzilla_path);
            }
        });
        Button BehinderButton = new Button("behinder_v4.0.2");
        BehinderButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String Behinder_path = "文件路径";
                String command = "java -jar Behinder.jar";
                openJar(command, Behinder_path);
            }
        });
        Button AntSwordButton = new Button("蚁剑");
        AntSwordButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String AntSword_path = "文件路径\\AntSword.exe";
                String command = "cmd /c start \"\" \"" + AntSword_path + "\"";
                runTools(command);
            }
        });
//注入工具
        HBox tab2_hbox1 = new HBox();
        tab2_hbox1.setSpacing(10);
        tab2_hbox1.setPadding(new Insets(10, 10, 10, 10));
        Text tab2_text1 = new Text("sql注入");
        tab2_hbox1.getChildren().addAll(sqlmapButton, sqlInjButton);
        tab2_vbox1.getChildren().addAll(tab2_text1, tab2_hbox1);

//弱口令
        HBox tab2_hbox2 = new HBox();
        tab2_hbox2.setSpacing(10);
        tab2_hbox2.setPadding(new Insets(10, 10, 10, 10));
        Text tab2_text2 = new Text("弱口令");
        tab2_hbox2.getChildren().addAll(weakPassButton);
        tab2_vbox1.getChildren().addAll(tab2_text2, tab2_hbox2);

//webshell管理
        HBox tab2_hbox3 = new HBox();
        tab2_hbox3.setSpacing(10);
        tab2_hbox3.setPadding(new Insets(10, 10, 10, 10));
        Text tab2_text3 = new Text("webshell管理");
        tab2_hbox3.getChildren().addAll(godzillaButton, BehinderButton, AntSwordButton);
        tab2_vbox1.getChildren().addAll(tab2_text3, tab2_hbox3);


        tab2.setContent(tab2_vbox1);
        tabPane.getTabs().add(tab2);

//编码小工具
        Tab tab3 = new Tab("编码器");
        HBox tab3_hBox1 = new HBox();
        tab3_hBox1.setSpacing(10);
        tab3_hBox1.setPadding(new Insets(10, 10, 10, 10));

        VBox tab3_vBox1 = new VBox();
        tab3_vBox1.setSpacing(10);
        tab3_vBox1.setPadding(new Insets(10, 10, 10, 10));

        Text tab3_text1 = new Text("原始数据：");

        TextArea tab3_textAreainput = new TextArea();
        tab3_textAreainput.setPrefWidth(300);
        tab3_textAreainput.setPrefHeight(400);
        tab3_textAreainput.setWrapText(true);

        tab3_vBox1.getChildren().addAll(tab3_text1,tab3_textAreainput);
        tab3_vBox1.setAlignment(Pos.CENTER);

        VBox tab3_vBox2 = new VBox();
        tab3_vBox2.setSpacing(10);
        tab3_vBox2.setPadding(new Insets(10, 10, 10, 10));
        Text tab3_text2 = new Text("编码转换>>>>>");
        ChoiceBox<String> tab3_choicebox = new ChoiceBox<String>(FXCollections.observableArrayList("base64encode", "base64decode", "md5", "stringtohex", "hextostring", "待添加"));
        tab3_choicebox.setPrefWidth(175);
        tab3_choicebox.setPrefHeight(30);

        VBox tab3_vbox3 = new VBox();
        tab3_vbox3.setSpacing(10);
        tab3_vbox3.setPadding(new Insets(10, 10, 10, 10));
        Text tab3_text3 = new Text("转换数据：");

        TextArea tab3_textAreaoutput = new TextArea();
        tab3_textAreaoutput.setPrefWidth(300);
        tab3_textAreaoutput.setPrefHeight(400);
        tab3_textAreaoutput.setWrapText(true);

        tab3_vbox3.getChildren().addAll(tab3_text3, tab3_textAreaoutput);
        tab3_vbox3.setAlignment(Pos.CENTER);

        Button tab3_choice_button = new Button("提交");
        tab3_choice_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String string = tab3_textAreainput.getText();
                String method = tab3_choicebox.getValue();
                StringTransform stringTansform = new StringTransform();
                String s = stringTansform.getInfo(string, method);
                tab3_textAreaoutput.setText(s);

            }
        });

        tab3_vBox2.getChildren().addAll(tab3_text2, tab3_choicebox, tab3_choice_button);
        tab3_vBox2.setAlignment(Pos.CENTER);

        tab3_hBox1.getChildren().addAll(tab3_vBox1, tab3_vBox2, tab3_vbox3);
        tab3.setContent(tab3_hBox1);
        tabPane.getTabs().add(tab3);




//常见的框架与中间件
        Tab tab4 = new Tab("框架与中间件");
        VBox tab4_vbox1 = new VBox();
        tab4_vbox1.setSpacing(10);
        tab4_vbox1.setPadding(new Insets(10, 10, 10, 10));
        Button shiroAttButton = new Button("shiro-attack-4.4");
        shiroAttButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String shiro_path = "文件路径";
                String command = "java -jar shiro_attack-4.4-SNAPSHOT-all.jar";
                openJar(command, shiro_path);
            }
        });
        Button shiroNoCCButton = new Button("Shiro-550-with-NoCC");
        shiroNoCCButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String shiroNoCC_path = "文件路径";
                String command = "java -jar Shiro-550-with-NoCC.jar";
                openJar(command, shiroNoCC_path);
            }
        });
        Button shiroExpButton = new Button("ShiroExploit.V2.5");
        shiroExpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String shiro_path = "文件路径";
                String command = "java -jar ShiroExploit.jar";
                openJar(command, shiro_path);
            }
        });
        Button struts2Button = new Button("struts2利用工具");
        struts2Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String struts2_path = "文件路径";
                String command = "java -jar struts2_19.jar";
                openJar(command, struts2_path);
            }
        });
        Button LiqunKitButton = new Button("LiqunKit_1.5");
        LiqunKitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String LiqunKit_path = "文件路径";
                String command = "java -jar LiqunKit_1.5.jar";
                openJar(command, LiqunKit_path);
            }
        });
        Button lostWorldButton = new Button("Thelostworld_OA");
        lostWorldButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String lostWorld_path = "文件路径";
                String command = "java -jar Thelostworld_OA.jar";
                openJar(command, lostWorld_path);
            }
        });




//OA协同相关漏洞利用
        HBox tab4_hbox1 = new HBox();
        tab4_hbox1.setSpacing(10);
        tab4_hbox1.setPadding(new Insets(10, 10, 10, 10));
        Text tab4_text1 = new Text("OA协同");
        tab4_hbox1.getChildren().addAll(lostWorldButton);
        tab4_vbox1.getChildren().addAll(tab4_text1, tab4_hbox1);

//常见漏洞利用工具
        HBox tab4_hbox2 = new HBox();
        tab4_hbox2.setSpacing(10);
        tab4_hbox2.setPadding(new Insets(10, 10, 10, 10));
        Text tab4_text2 = new Text("常见漏洞利用工具");
        tab4_hbox2.getChildren().addAll(shiroAttButton, shiroExpButton, shiroNoCCButton, struts2Button, LiqunKitButton);
        tab4_vbox1.getChildren().addAll(tab4_text2, tab4_hbox2);

//
//        HBox tab4_hbox3 = new HBox();
//        tab4_hbox3.setSpacing(10);
//        tab4_hbox3.setPadding(new Insets(10, 10, 10, 10));
//        Text tab4_text3 = new Text("综合工具");
//        tab4_hbox3.getChildren().addAll(godzillaButton, BehinderButton, AntSwordButton);
//        tab4_vbox1.getChildren().addAll(tab4_text3, tab4_hbox3);


        tab4.setContent(tab4_vbox1);
        tabPane.getTabs().add(tab4);

        root.setCenter(tabPane);
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



//运行软件，传递command参数
private void runTools(String command){
    try {
        Process process = Runtime.getRuntime().exec(command);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//针对部分文件需要在指定路径中打开
private void openInSpePath(String command, String file_path){
    try {
        Runtime.getRuntime().exec(command, null, new File(file_path));
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}
//打开jar包 传递command(java -jar myjar.jar)与jar_path(myjar.jar的路径)
private void openJar(String command, String jar_path){
    try {
        // 构建ProcessBuilder对象
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", command);
        // 指定工作目录
        pb.directory(new File(jar_path));
        // 启动进程
        pb.start();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

//在浏览器中打开
private void OpenBrowserExample(String url){
    if (Desktop.isDesktopSupported()) {
        try {
            // 创建 URI 对象
            URI uri = new URI(url);

            // 获取桌面对象
            Desktop desktop = Desktop.getDesktop();

            // 打开默认浏览器并访问指定的 URL
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("当前平台不支持桌面操作。");
    }
}
}
