package com.darkorbit

interface UIFeatureBarCommand : ProtocolPacket {
	var featureBarItems: MutableList<ItemCommand>
	var featureBarOrder: String
	var featureBarPosition: String
	var featureBarType: FeatureBarType
}
