

t=outlookbar.addtitle('修改密码')
outlookbar.additem('修改密码',t,'/dzzw/admin/userinfo/userPw.jsp')


t=outlookbar.addtitle('网站公告')
outlookbar.additem('网站公告',t,'/dzzw/gonggaoMana.action')


t=outlookbar.addtitle('政府网站')
outlookbar.additem('网站列表',t,'/dzzw/lianjieMana.action')
outlookbar.additem('网站录入',t,'/dzzw/admin/lianjie/lianjieAdd.jsp')


t=outlookbar.addtitle('领导信箱')
outlookbar.additem('领导信箱管理',t,'/dzzw/lingdaoxinxiangMana.action')
outlookbar.additem('领导信箱录入',t,'/dzzw/admin/lingdaoxinxiang/lingdaoxinxiangAdd.jsp')


t=outlookbar.addtitle('表格下载')
outlookbar.additem('表格下载',t,'/dzzw/biaogexiazaiMana.action')
outlookbar.additem('添加表格',t,'/dzzw/admin/biaogexiazai/biaogexiazaiAdd.jsp')


t=outlookbar.addtitle('政务公开')
outlookbar.additem('政务公开管理',t,'/dzzw/zhengwuMana.action')


t=outlookbar.addtitle('便民电话')
outlookbar.additem('电话管理',t,'/dzzw/bianmindianhuaMana.action')
outlookbar.additem('电话录入',t,'/dzzw/admin/bianmindianhua/bianmindianhuaAdd.jsp')

t=outlookbar.addtitle('新闻动态')
outlookbar.additem('新闻动态',t,'/dzzw/picNewsMana.action')

t=outlookbar.addtitle('地区概况')
outlookbar.additem('地区概况',t,'/dzzw/diqugaikuangMana.action')

t=outlookbar.addtitle('留言管理')
outlookbar.additem('留言管理',t,'/dzzw/liuyanMana.action')


t=outlookbar.addtitle('退出系统') 
outlookbar.additem('安全退出',t,'/dzzw/login.jsp')