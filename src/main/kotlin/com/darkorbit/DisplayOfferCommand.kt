package com.darkorbit

interface DisplayOfferCommand : ProtocolPacket {
	var alignment: AlignmentModule
	var closeable: Boolean
	var key: String
	var link: String
	var lootIds: MutableList<RewardModule>
	var moveable: Boolean
	var packageName: String
	var percentage: Int
	var price: String
}
