package com.darkorbit

interface PassEventCommand : ProtocolPacket {
	var currentExp: Int
	var currentLevel: Int
	var isVip: Boolean
	var nextLevelExp: Int
	var normalItemList: MutableList<PassItemModule>
	var remainSeconds: Int
	var vipItemList: MutableList<PassItemModule>
	var vipParams: MutableList<Int>
}
