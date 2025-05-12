package com.darkorbit

interface VideoWindowCreateCommand : ProtocolPacket {
	var languageKeys: MutableList<String>
	var showButtons: Boolean
	var videoID: Int
	var videoType: VideoTypes
	var windowAlign: String
	var windowID: Int
}
