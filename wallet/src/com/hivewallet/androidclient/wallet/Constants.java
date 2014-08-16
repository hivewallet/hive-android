/*
 * Copyright 2011-2014 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.hivewallet.androidclient.wallet;

import java.nio.charset.Charset;

import android.os.Build;
import android.text.format.DateUtils;

import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.params.MainNetParams;
import com.google.bitcoin.params.TestNet3Params;

import com.hivewallet.androidclient.wallet_test.R;

/**
 * @author Andreas Schildbach
 */
public final class Constants
{
	public static final boolean TEST = R.class.getPackage().getName().contains("_test");

	public static final NetworkParameters NETWORK_PARAMETERS = TEST ? TestNet3Params.get() : MainNetParams.get();
	private static final String FILENAME_NETWORK_SUFFIX = NETWORK_PARAMETERS.getId().equals(NetworkParameters.ID_MAINNET) ? "" : "-testnet";

	public final static class Files
	{
		public static final String WALLET_FILENAME_PROTOBUF = "wallet-protobuf" + FILENAME_NETWORK_SUFFIX;

		public static final String WALLET_KEY_BACKUP_BASE58 = "key-backup-base58" + FILENAME_NETWORK_SUFFIX;
		public static final String WALLET_KEY_BACKUP_PROTOBUF = "key-backup-protobuf" + FILENAME_NETWORK_SUFFIX;

		public static final int EXTERNAL_WALLET_NUMBER_OF_BACKUPS_KEPT = 5;
		public static final String EXTERNAL_WALLET_BACKUP_DIR = "backups" + FILENAME_NETWORK_SUFFIX;
		public static final String EXTERNAL_WALLET_KEY_BACKUP = "hive-android-wallet-keys" + FILENAME_NETWORK_SUFFIX;
		public static final String EXTERNAL_WALLET_BACKUP = "hive-android-wallet-backup" + FILENAME_NETWORK_SUFFIX;
		public static final String EXTERNAL_WALLET_TMP_FILE = "external-wallet-backup-source" + FILENAME_NETWORK_SUFFIX;

		public static final String BLOCKCHAIN_FILENAME = "blockchain" + FILENAME_NETWORK_SUFFIX;

		public static final String CHECKPOINTS_FILENAME = "checkpoints" + FILENAME_NETWORK_SUFFIX;
	}

	public static final long BACKUP_MAX_CHARS = 5000000;

	private static final String EXPLORE_BASE_URL_PROD = "https://www.biteasy.com/";
	private static final String EXPLORE_BASE_URL_TEST = "https://www.biteasy.com/testnet/";
	public static final String EXPLORE_BASE_URL = NETWORK_PARAMETERS.getId().equals(NetworkParameters.ID_MAINNET) ? EXPLORE_BASE_URL_PROD
			: EXPLORE_BASE_URL_TEST;

	private static final String BITEASY_API_URL_PROD = "https://api.biteasy.com/blockchain/v1/";
	private static final String BITEASY_API_URL_TEST = "https://api.biteasy.com/testnet/v1/";
	public static final String BITEASY_API_URL = NETWORK_PARAMETERS.getId().equals(NetworkParameters.ID_MAINNET) ? BITEASY_API_URL_PROD
			: BITEASY_API_URL_TEST;

	public static final String MIMETYPE_TRANSACTION = "application/x-btctx";
	public static final String MIMETYPE_WALLET_BACKUP = "application/x-bitcoin-wallet-backup";

	public static final int MAX_NUM_CONFIRMATIONS = 7;
	public static final String USER_AGENT = "Hive";
	public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";
	public static final int WALLET_OPERATION_STACK_SIZE = 256 * 1024;
	public static final long BLOCKCHAIN_STATE_BROADCAST_THROTTLE_MS = DateUtils.SECOND_IN_MILLIS;
	public static final long BLOCKCHAIN_UPTODATE_THRESHOLD_MS = DateUtils.HOUR_IN_MILLIS;

	public static final String CURRENCY_CODE_BTC = "BTC";
	public static final String CURRENCY_CODE_MBTC = "mBTC";
	public static final String CURRENCY_CODE_UBTC = "µBTC";
	public static final char CHAR_HAIR_SPACE = '\u200a';
	public static final char CHAR_THIN_SPACE = '\u2009';
	public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
	public static final char CHAR_CHECKMARK = '\u2713';
	public static final String CURRENCY_PLUS_SIGN = "+" + CHAR_THIN_SPACE;
	public static final String CURRENCY_MINUS_SIGN = "-" + CHAR_THIN_SPACE;
	public static final String PREFIX_ALMOST_EQUAL_TO = Character.toString(CHAR_ALMOST_EQUAL_TO) + CHAR_THIN_SPACE;
	public static final int ADDRESS_FORMAT_GROUP_SIZE = 4;
	public static final int ADDRESS_FORMAT_LINE_SIZE = 12;

	public static final int BTC_MAX_PRECISION = 8;
	public static final int MBTC_MAX_PRECISION = 5;
	public static final int UBTC_MAX_PRECISION = 2;
	public static final int LOCAL_PRECISION = 4;

	public static final String DONATION_ADDRESS = "12D6iVk8bTaWCErXs71WfCzqfXP9nnphKJ";
	public static final String REPORT_EMAIL = "jan@hivewallet.com";
	public static final String REPORT_SUBJECT_ISSUE = "Reported issue";
	public static final String REPORT_SUBJECT_CRASH = "Crash report";

	public static final String LICENSE_URL = "http://www.gnu.org/licenses/gpl-3.0.txt";
	public static final String SOURCE_URL = "https://github.com/hivewallet/hive-android";
	public static final String BINARY_URL = "https://www.hivewallet.com/";
	public static final String CREDITS_BITCOINJ_URL = "http://code.google.com/p/bitcoinj/";
	public static final String CREDITS_ZXING_URL = "https://github.com/zxing/zxing";
	public static final String CREDITS_ICON_URL = "http://thenounproject.com/";
	public static final String AUTHOR_TWITTER_URL = "https://twitter.com/hivewallet";
	public static final String AUTHOR_GOOGLEPLUS_URL = "https://plus.google.com/+JanVornberger";
	public static final String COMMUNITY_GOOGLEPLUS_URL = "https://plus.google.com/communities/115942500002485175926";
	public static final String MARKET_APP_URL = "market://details?id=%s";
	public static final String WEBMARKET_APP_URL = "https://play.google.com/store/apps/details?id=%s";

	public static final boolean ENABLE_VERSION_ALERT = false;
	public static final String VERSION_URL = "http://wallet.schildbach.de/version";
	public static final int HTTP_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

	public static final long LAST_USAGE_THRESHOLD_JUST_MS = DateUtils.HOUR_IN_MILLIS;
	public static final long LAST_USAGE_THRESHOLD_RECENTLY_MS = 2 * DateUtils.DAY_IN_MILLIS;

	public static final int SDK_JELLY_BEAN = 16;
	public static final int SDK_JELLY_BEAN_MR2 = 18;

	public static final int SDK_DEPRECATED_BELOW = Build.VERSION_CODES.ICE_CREAM_SANDWICH;

	public static final boolean BUG_OPENSSL_HEARTBLEED = false;

	public static final int MEMORY_CLASS_LOWEND = 48;

	public static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Charset US_ASCII = Charset.forName("US-ASCII");

	public static final String APP_STORE_ID = "wei-lu.app-store";
	public static final String APP_STORE_MANIFEST = "wei-lu.app-store/manifest.json";
	public static final String APP_STORE_ICON = "file:///android_asset/wei-lu.app-store/images/logo.png";

	public static final String APP_PLATFORM_FOLDER = "app_platform";
	public static final String APP_PLATFORM_APP_FOLDER = "apps";
	
	public static final String PHOTO_ASSETS_FOLDER = "photo_assets";
	
	public static final String FILE_PROVIDER_AUTHORITY = R.class.getPackage().getName() + ".fileprovider"; 
}
