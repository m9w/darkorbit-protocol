package com.darkorbit

interface VIPMerchantExchangeInfoCommand : ProtocolPacket {
	var exchangeList: MutableList<VIPMerchantExchangeModule>
	var packageList: MutableList<String>
	var packagesBought: Short
	var timeToEventEnd: Long
}
