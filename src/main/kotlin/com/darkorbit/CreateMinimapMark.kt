package com.darkorbit

interface CreateMinimapMark : ProtocolPacket {
	var count: Int
	var interval: Float
	var inverse: Boolean
	var positionX: Int
	var positionY: Int
	var scale: Float
	var soundModule: SoundTriggerModule
	var type: MinimapMarkType
	var uid: String
}
