package com.darkorbit

interface UILayoutCommand : ProtocolPacket {
	var featureBars: MutableList<UIFeatureBarCommand>
}
