CREATE TABLE `contract` (
  `id` varchar(100) NOT NULL,
  `creater_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '创建者id',
  `create_time` timestamp NOT NULL COMMENT '契约创建时间',
  `update_time` timestamp NOT NULL COMMENT '契约更新时间',
  `start_time` timestamp NULL DEFAULT NULL COMMENT '契约开始时间',
  `end_time` timestamp NULL DEFAULT NULL COMMENT '契约结束时间',
  `type` int NOT NULL COMMENT '契约类型，1：1vs1,3：3vs3,4：4vs4，0：多vs多',
  `creater_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '创建者name',
  `joiner` text COMMENT '加入契约者',
  `notice` text COMMENT '告示(契约目的)',
  `level` int NOT NULL COMMENT '球赛等级：1：初级，娱乐练习局，2：中级，常规野球局，3：高级，高手互爆局',
  `address` varchar(100) DEFAULT NULL COMMENT '位置',
  `picture` varchar(100) DEFAULT NULL COMMENT '创建者头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `goods` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `userid` varchar(100) DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `news` (
  `id` varchar(100) NOT NULL,
  `context` text,
  `pictures` text,
  `title` varchar(100) DEFAULT NULL,
  `creater_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci



CREATE TABLE `users` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '姓名',
  `iphone` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '手机号',
  `gender` int DEFAULT NULL COMMENT '性别',
  `wechat_id` varchar(100) DEFAULT NULL COMMENT '微信号',
  `picture` varchar(100) DEFAULT NULL COMMENT '微信头像',
  `update_time` timestamp NULL DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

