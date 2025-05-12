package com.darkorbit

interface MapAssetActionAvailableCommand : ProtocolPacket {
	var activatable: Boolean
	var additionalInformation: AssetInformationModule
	var mapAssetId: Int
	var state: AvailabilityState
	var toolTip: MessageKeyListWildcardCommand
}
