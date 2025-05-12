package com.darkorbit

interface MileageMarketInfoCommand : ProtocolPacket {
	var coinCount: Int
	var exchangePackages: MutableList<MileageMarketPackageModule>
	var packageList: MutableList<String>
	var timeToEventEnd: Long
}
