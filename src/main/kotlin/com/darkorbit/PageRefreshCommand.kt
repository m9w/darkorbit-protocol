package com.darkorbit

interface PageRefreshCommand : ProtocolPacket {
	var openPage: Boolean
	var pageType: PageType
}
