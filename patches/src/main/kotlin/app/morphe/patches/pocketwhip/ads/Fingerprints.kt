/*
 * Copyright (C) 2026 Bogat25
 * SPDX-License-Identifier: GPL-3.0-only
 */
package app.morphe.patches.pocketwhip.ads

import app.morphe.patcher.Fingerprint

/**
 * `BaseAdView.loadAd(AdRequest)` of the Google Mobile Ads SDK. Every banner `AdView` loads through it.
 * Public SDK API, so its name does not change with app updates or obfuscation.
 */
internal object BannerLoadAdFingerprint : Fingerprint(
    definingClass = "Lcom/google/android/gms/ads/BaseAdView;",
    name = "loadAd",
    returnType = "V",
    parameters = listOf("Lcom/google/android/gms/ads/AdRequest;"),
)
