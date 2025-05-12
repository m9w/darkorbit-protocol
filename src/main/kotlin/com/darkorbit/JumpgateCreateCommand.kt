package com.darkorbit

interface JumpgateCreateCommand : ProtocolPacket {
	var decoratorAssetTypes: MutableList<Int>
	var designId: Int
	var factionId: Int
	var gateId: Int
	var isVisibleOnMinimap: Boolean
	var showBubble: Boolean
	var x: Int
	var y: Int
}
