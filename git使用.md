# -
听网课笔记:xmind
GIT本地库使用
	新建本地仓库
		新建文件夹
			mkdir 文件夹名
	初始化本地仓库
		
		查看本地git版本
			git --version
		清屏操作
			clear
		用户名设置
			git config --global user.name "名字"
		邮箱设置
			git config --global user.email "邮箱"
		进入文件夹
			cd 文件夹名
			打开目标文件夹-右键-git bash here
		仓库初始化
			进入目标文件夹-git init
		查看文件夹中文件
			ll
			ll -la(包括隐藏文件)
	常用命令
		本地库添加文件
			1.文件夹中新建文件
			2.文件提交至暂存区
				git add  文件全名  
			3.文件提交至本地库
				git commit (-m "注释")  文件名
				-m(添加注释命令)  "注释内容"
			4.注意:
				1.文件不是位于本地库下,git无法管理
				2.放在本地仓库的文件,git也不管理,必须通过add-commit 命令操作后才可以将内容提交至本地库
				子主题 3
		查看
			5.查看文件位置状态(位于暂存区/本地库/未被管理)
				git status
			6.查看提交的，显示从最近到最远的日志
				1.git log 
					可查看历史记录对应的索引值
						key:索引
						value:历史记录
					历史记录过多的时，查看日志，有分页效果，分屏效果，一页展示不下：
						下一页：空格
						上一页： b
						退出：q
						到尾页了，显示END
				2：git log --pretty=onelint
					简洁的显示
				3：git --oneline
					更简洁de显示
				4：git reflog
					增加信息：HEAD@{数字}
					数字的含义：指针回到当前这个历史版本需要走多少步
			7.查看文件内容
				cat 文件名
		版本回滚
			8.前进或者后退历史版本
				1.hard参数：
					git reset --hard [索引]
						本地库的指针移动的同时，重置暂存区，重置工作区
				2.mixed参数：
					git reset --mixed [索引]
						本地库的指针移动的同时，重置暂存区，但是工作区不动
				3.soft参数：
					git reset --soft [索引]
						本地库的指针移动的时候，暂存区，工作区都不动
				总结：以后用的多的就是  第一种hard参数
		删除及找回
			9.删除指令
				1.删除工作区文件
					rm 文件名
				2.将删除操作同步到暂存区：
					git add 文件名
				3.将删除操作同步到本地库：
					git commit -m "注释" 文件名
			10.找回本地库中删除的文件
				实际上就是将历史版本切换到刚才添加文件的那个版本即可：
					git reset --hard  索引
		文件比对
			11.文件比对操作
				注:git 以行为单位进行比对
				将工作区中的文件和暂存区中文件进行比较 
					git  diff  [文件名]
				比较工作区中和暂存区中 所有文件的差异
					git diff 
				比较暂存区和工作区中内容
					git diff [历史版本][文件名]
	分支
		在版本控制过程中，使用多条线同时推进多个任务。这里面说的多条线，就是多个分支。
			
		1.查看分支命令
			git branch -v(查看所有分支及对应历史索引)
			"*"位置代表当前所在位置
		2.创建分支
			git branch  分支名字
		3.切换分支位置
			git checkout 分支名字
		4.合并分支
			1.进入主分支
				git checkout master
			2.合并分支到主干
				git merge 分支名
				(master|merging)表示当前处在合并状态
					
				出现冲突:  同一个文件的同一个位置
					
					解决：
					公司内部商议解决，或者自己决定  人为决定，留下想要的即可：
					将工作区中内容添加到暂存区
					然后进行commit操作：
						注:commit 此处不带文件名
	远程库使用
		创建远程库
			【1】创建远程库
				
			【2】录入信息：仓库名称等
			【3】添加自述文件(可选)
		链接远程库
			1.查看远程库地址
				进入远程库主页-code下拉列表
			2.通过别名访问
				远程库 web url 较长git 本地可将地址通过别名保存
				查看别名
					git remote (-v)
				起别名(增加别名)
					git remote add  新别名   远程库地址(https) 
			3.本地推送数据到远程(push操作)
				git push   远程库url/已创建的别名  master(主干或分支)
				push失败原因:
					上传文件过大
						将postBuffer的值配置为500M
						git config --global http.postBuffer 1048576000
			4.克隆数据到本地
				git clone  (-b 分支名字)  目标地址(url)
				不在主干的文件使用  (-b  分支名)指示位置
			5.多人合作
			6.拉取操作
				1.分布骤:pull=fetch+mearge
					1.读取内容抓取操作(无需登陆)
						git fetch 别名 分支名
							在抓取操作执行后，只是将远程库的内容下载到本地，但是工作区中的文件并没有更新。工作区中还是原先的内容：
					2.切换回主分支进行mearge(合并分支操作)
						git mearge origin(别名)/master(分支名)
					相对全面
				2.直接拉取:(pull)
					git pull origin(别名) master(分支名) 
					相对简单
			7.ssh免密操作
				1.使用终端进入用户目录
					cd ~
				2.生成文件夹(生成一个.ssh的目录)
					ssh-keygen -t rsa -C(大写)  账号邮箱 
				3.进入.ssh目录复制密钥
				4.登陆github 启用密钥