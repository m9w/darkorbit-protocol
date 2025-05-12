package com.darkorbit

interface CaptchaBoxModule : ProtocolPacket {
	var boxType: eBoxType
	var index: Int
}
