package com.darkorbit

interface CaptchaTriggerCommand : ProtocolPacket {
	var Radius: Int
	var blackBox: Int
	var captchaParam: Int
	var captchaTimer: Int
	var posX: Int
	var posY: Int
	var redBox: Int
	var type: eCaptchaType
}
