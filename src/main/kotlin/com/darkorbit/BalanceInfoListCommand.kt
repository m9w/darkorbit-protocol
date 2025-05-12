package com.darkorbit

interface BalanceInfoListCommand : ProtocolPacket {
	var list: MutableList<BalanceInfoCommand>
	var page: Int
	var pageCount: Int
}
