#language:zh-CN
  功能:打开163登录功能
    #场景: 打开网站
      #当我打开163网站
    场景: 正确的账号登录
        并且我在email文本框输入"meyoungtester"
        并且我在密码框输入"meyoung123"
        当我点击登录按钮
        那么我登录成功
    @Automation
    场景:正确的账号登录2
       # 当我打开163网站
        假如我用"meyoungtester"账号,密码"meyoung123"登录
        那么我登录成功
    场景大纲: 测试正确的账号登录
        假如我用"<email>"账号,密码"<pwd>"登录
        那么我登录成功
        例子:
        |email|pwd|
        |test1|pwd1|
        |test2|pwd2|
    #场景: 关闭浏览器
       #当关闭网站





