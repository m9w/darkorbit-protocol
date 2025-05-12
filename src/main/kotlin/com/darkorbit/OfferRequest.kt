package com.darkorbit

interface OfferRequest : ProtocolPacket {
	var acceptedOffer: Boolean
	var packageName: String
}
