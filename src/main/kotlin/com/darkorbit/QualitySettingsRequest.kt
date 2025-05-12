package com.darkorbit

interface QualitySettingsRequest : ProtocolPacket {
	var qualityAttack: Short
	var qualityBackground: Short
	var qualityCollectables: Short
	var qualityCustomized: Boolean
	var qualityEffect: Short
	var qualityEngine: Short
	var qualityExplosion: Short
	var qualityPOIzone: Short
	var qualityPresetting: Short
	var qualityShip: Short
}
